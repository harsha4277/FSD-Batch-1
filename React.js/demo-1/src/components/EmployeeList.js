import React, { useEffect, useState } from 'react';
import { getEmployees, deleteEmployee } from '../services/EmployeeService';
import { Link } from 'react-router-dom';

function EmployeeList() {
    const [employees, setEmployees] = useState([]);

    useEffect(() => {
        loadEmployees();
    }, []);

    const loadEmployees = async () => {
        const res = await getEmployees();
        setEmployees(res.data);
    };

    const handleDelete = async (id) => {
        await deleteEmployee(id);
        loadEmployees();
    };

    return (
        <div>
            <h2>Employee List</h2>
            <Link to="/add">Add Employee</Link>
            <table>
                <thead>
                    <tr><th>ID</th><th>Name</th><th>Email</th><th>Actions</th></tr>
                </thead>
                <tbody>
                    {employees.map(emp => (
                        <tr key={emp.id}>
                            <td>{emp.id}</td>
                            <td>{emp.firstName} {emp.lastName}</td>
                            <td>{emp.email}</td>
                            <td>
                                <Link to={`/edit/${emp.id}`}>Edit</Link>
                                <button onClick={() => handleDelete(emp.id)}>Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}
export default EmployeeList;
