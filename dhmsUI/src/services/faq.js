import axios from 'axios'

//axios.defaults.baseURL = 'http://jsonplaceholder.typicode.com'

const faq = {
    getPosts() {
        return new Promise((resolve) => {
            axios.get('http://jsonplaceholder.typicode.com/posts')
            .then(response => {
              resolve(response.data.slice(0,10));
            })
            .catch(e => {
              resolve(e)
            })
        })
    }
}

export default faq;