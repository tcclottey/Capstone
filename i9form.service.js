import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

// eslint-disable-next-line import/no-anonymous-default-export
export default {
    async saveI9Form(I9Form) {
        try {
            const response = await axios.post(`${API_URL}/i9forms`, I9Form);
            return response.data;
        } catch (error) {
            throw error;
        }
    },
    async getI9Form(id) {
        try {
            const response = await axios.get(`${API_URL}/i9forms/${id}/${id}`);
            return response.data;
        } catch (error) {
            throw error;
        }
    },
};

