import axios from 'axios'

//axios.defaults.baseURL = ''

const customer = {
    searchCustomer(firstName, lastName, idNumber) {
        return new Promise((resolve) => {
            axios.get('http://localhost:5000/api/customers/search?firstname=' + firstName, {
                params: {
                  firstname: firstName,
                  lastname: lastName,
                  idnbr: idNumber
                }})
            .then(response => {
              resolve(response.data);
            })
            .catch(e => {
              resolve(e)
            })
        })
    }
}

export default customer;