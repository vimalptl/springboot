import Axios from 'axios';

const API_URL = 'http://localhost:5000';

export default class APIService {


    constructor() {}

    getCustomers() {
        const url = API_URL + '/api/customers';
        return Axios.get(url).then(response => response.data);
    }

    getCustomer(pk) {
        const url = API_URL + '/api/customers/${pk}';
        return Axios.get(url).then(response => response.data);
    }

    searchCustomers(firstName, lastName, idNumber) {
        const url = API_URL + '/api/customers/search?firstname=${firstname}&lastname=${lastName}&idnbr=${idNumber}';
        return Axios.get(url).then(response => response.data);        
    }

}