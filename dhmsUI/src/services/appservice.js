import axios from 'axios';

//axios.defaults.baseURL = 'https://api.fullstackweekly.com';

axios.interceptors.request.use(function(config) {
    // when the code is running on the server, there's no window object
    if (typeof window === 'undefined') {
        return config;
    }
    const token = window.localStorage.getItem('token');
    if (token) {
        config.headers.Authorization = 'Bearer '+token;
        //alert (config.headers.Authorization);
    }
    return config;
});

const appService = {
    getProfile () {
        return new Promise ((resolve) => {
            // axios.get('https://api.fullstackweekly.com/services/profile.php', {
            //     headers: {
            //         'Authorization' : 'Bearer ${window.localStorage.getItem(\'token\')}'
            //     }
            axios.get('https://api.fullstackweekly.com/services/profile.php').then(response => {
                resolve(response.data);
            })
        })
    },
    login(credentials) {
        return new Promise((resolve, reject) => {
            axios.post('https://api.fullstackweekly.com/services/auth.php', credentials)
            .then(response => {
                resolve (response.data);
            }).catch(response => {
                reject(response.status);
            })
        });
    }
}

export default appService;