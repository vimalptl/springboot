import axios from 'axios'

//axios.defaults.baseURL = 'http://jsonplaceholder.typicode.com'

const user = {
    getPosts() {
        return new Promise((resolve) => {
            axios.get('http://jsonplaceholder.typicode.com/users')
            .then(response => {
              resolve(response.data.slice(0,5));
            })
            .catch(e => {
              resolve(e)
            })
        })
    }
}

export default user;