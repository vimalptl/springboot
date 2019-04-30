import axios from 'axios'

//axios.defaults.baseURL = 'http://jsonplaceholder.typicode.com'
const API_BASE_URL = 'http://localhost:5000/api';
export const ACCESS_TOKEN = 'accessToken';

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
    },


  login(loginRequest) {
    return new Promise((resolve, reject) => {
      axios.post(API_BASE_URL + "/auth/signin", loginRequest)
      .then(response => {
          resolve (response.data);
      }).catch(response => {
          reject(response.status);
      })
    });
  },
  
  signup(signupRequest) {
    return new Promise((resolve, reject) => {
      axios.post(API_BASE_URL + "/auth/signup", signupRequest)
      .then(response => {
          resolve (response.data);
      }).catch(e => {
          reject(e.response.data);
      })
    });
  },
  
  checkUsernameAvailability(username) {
    return new Promise((resolve, reject) => {
      axios.get(API_BASE_URL + "/user/checkUsernameAvailability?username=" + username)
      .then(response => {
          resolve (response.data);
      }).catch(response => {
          reject(response.status);
      })
    });
  },
  
  checkEmailAvailability(email) {
    return new Promise((resolve, reject) => {
      axios.get(API_BASE_URL + "/user/checkEmailAvailability?email=" + email)
      .then(response => {
          resolve (response.data);
      }).catch(response => {
          reject(response.status);
      })
    });
  },
  
  
  getCurrentUser() {
      if(!localStorage.getItem(ACCESS_TOKEN)) {
          return Promise.reject("No access token set.");
      }

      return new Promise((resolve, reject) => {
        axios.get(API_BASE_URL + "/user/me")
        .then(response => {
            resolve (response.data);
        }).catch(response => {
            reject(response.status);
        })
      });    
       
  },
  
  getUserProfile(username) {
    return new Promise((resolve, reject) => {
      axios.get(API_BASE_URL + "/users/" + username)
      .then(response => {
          resolve (response.data);
      }).catch(response => {
          reject(response.status);
      })
    });    
  }

}

export default user;