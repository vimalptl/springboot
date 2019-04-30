import axios from 'axios'

//axios.defaults.baseURL = ''

const loginhist = {
    getPosts(userId) {
        return new Promise((resolve) => {
            axios.get('http://ladwclmgcc2.ri-net.com:8080/CCExternalRestService/loginhistory/' + userId)
            .then(response => {
              resolve(response.data);
            })
            .catch(e => {
              resolve(e)
            })
        })
    }
}

export default loginhist;