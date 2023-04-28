

import { createApp } from 'vue'
import App from './App.vue'
import store from './store'
import router from './router/index'
import jQuery from 'jquery'
import axios from 'axios'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap.js' 

/* 配置axios */
// axios.defaults.baseURL = 'http://localhost:8081/'

// 创建provide/inject实例
const app = createApp(App)
app.provide('axios', axios)
.use(router)
  .use(store)
  .use(jQuery)
  .mount('#app')



