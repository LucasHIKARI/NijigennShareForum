import { createRouter,createWebHistory } from 'vue-router'
/* createWebHashHistory, */ 
import HomeView from '../views/HomeView.vue'
import VipForum from '../views/VipForum.vue'
// import UploadFile from '../views/UploadFile.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomeView,
    // children:[
    //   {
    //   path:'VipForum',
    // // 路由懒加载，在路由地址为/VipForum的时候，才会加载组件代码，
    // // 不然页面初始化的时候就会加载路由页面代码
    //   component:() => 
    //     import('../views/VipForum.vue')
      
    // },
    // {
    //   path:'UploadFile',
    //   component:() => 
    //     import('../views/UploadFile.vue')
      
    // }

    // ]
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    //component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue' ) 
  }
   ,
  {
    path:'/VipForum',
    name:'VipForum',
    component:VipForum 
    
  },
  {
    path:'/UploadFile',
    name:'UploadFile',
        // 路由懒加载，在路由地址为/VipForum的时候，才会加载组件代码，
    // 不然页面初始化的时候就会加载路由页面代码
    component:() => 
      import('../views/UploadFile.vue')
    
  }
  
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
