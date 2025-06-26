import axios from 'axios';

const API_BASE = "http://localhost:8080/api/employees";

export const getEmployees = () => axios.get(API_BASE);
export const getEmployeeById = (id) => axios.get(`${API_BASE}/${id}`);
export const createEmployee = (emp) => axios.post(API_BASE, emp);
export const updateEmployee = (id, emp) => axios.put(`${API_BASE}/${id}`, emp);
export const deleteEmployee = (id) => axios.delete(`${API_BASE}/${id}`);
