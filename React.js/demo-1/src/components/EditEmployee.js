import React, { useEffect, useState } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { getEmployeeById, updateEmployee } from '../services/EmployeeService';

function EditEmployee() {
    const [employee, setEmployee] = useState({
        firstName: '',
        lastName: '',
        email: ''
    });

    const { id } = useParams();
    const navigate = useNavigate();

    useEffect(() => {
        loadEmployee();
    }, []);

    const loadEmployee = async () => {
        const res = await getEmployeeById(id);
        setEmployee(res.data);
    };

    const handleChange = (e) => {
        const { name, value } = e.target;
        setEmployee({ ...employee, [name]: value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        await updateEmployee(id, employee);
        navigate('/');
    };

    return (
        <div>
            <h2>Edit Employee</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>First Name:</label>
                    <input type="text" name="firstName" value={employee.firstName} onChange={handleChange} required />
                </div>
                <div>
                    <label>Last Name:</label>
                    <input type="text" name="lastName" value={employee.lastName} onChange={handleChange} required />
                </div>
                <div>
                    <label>Email:</label>
                    <input type="email" name="email" value={employee.email} onChange={handleChange} required />
                </div>
                <button type="submit">Update</button>
            </form>
        </div>
    );
}

export default EditEmployee;
