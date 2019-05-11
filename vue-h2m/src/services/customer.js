import axios from 'axios'

//axios.defaults.baseURL = ''

const customer = {
    searchCustomer(firstName, lastName, idNumber) {
        return new Promise((resolve) => {
            axios.get('http://localhost:5000/api/customers/search', {
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
    },
    addCustomer(customer) {
      return new Promise((resolve) => {
        axios.post('http://localhost:5000/api/customers/customer', customer)
        .then(response => {
          resolve(response.data);
        })
        .catch(e => {
          resolve(e)
        })
    })
},
updateCustomer(customer) {
  return new Promise((resolve) => {
    axios.put('http://localhost:5000/api/customers/customer', customer)
    .then(response => {
      resolve(response.data);
    })
    .catch(e => {
      resolve(e)
    })
})
},
getCustomer(custid) {
  return new Promise((resolve) => {
    axios.get('http://localhost:5000/api/customers/customer/'+custid)
    .then(response => {
      alert(JSON.stringify(response.data));
      resolve(response.data);
    })
    .catch(e => {
      resolve(e)
    })
})
}
}

export default customer;