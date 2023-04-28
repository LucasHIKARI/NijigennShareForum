<template>
  <div class="header text-center">
    <nav
      class="navbar navbar-expand-lg navbar-light"
      style="background-color: #e3f2fd"
    >
      <figure class="figure logo">
        <img
          src="@/assets/homeLogo.jpeg"
          class="figure-img img-fluid rounded"
          alt="404"
        />
        <figcaption class="figure-caption">
          ルカス ミュージックシェア フォーラム
        </figcaption>
      </figure>

      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon">button</span>
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <router-link class="nav-link" to="/">首页</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/VipForum">Vip Forum</router-link>
          </li>
          <li class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              href="#"
              role="button"
              data-toggle="dropdown"
              aria-expanded="false"
            >
              音乐分类
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#">动漫音乐</a>
              <a class="dropdown-item" href="#">流行音乐</a>
              <a class="dropdown-item" href="#">日本音乐</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              href="#"
              role="button"
              data-toggle="dropdown"
              aria-expanded="false"
            >
              AI绘画分类
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#">二次元图</a>
              <a class="dropdown-item" href="#">风景图</a>
              <a class="dropdown-item" href="#">游戏CG</a>
            </div>
          </li>
        </ul>
      </div>

      <form class="form-inline my-2 my-lg-0">
        <input
          class="form-control-sl mr-sm-1"
          type="search"
          placeholder="  曲名、歌手名前、アルバムで検測可能"
          aria-label="Search"
          style="border-radius: 20px"
        />
        <span>&nbsp;</span>
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
          検索
        </button>
      </form>
      &nbsp;&nbsp;
      <!-- Button trigger modal -->
      <button
        type="button"
        class="btn btn-primary"
        v-if="!isLogged"
        data-toggle="modal"
        data-target="#exampleModal"
      >
        Login
      </button>
      <button
        type="button"
        class="btn btn-primary"
        v-if="isLogged"
        @click="logout"
      >
        Logout
      </button>

      <div class="userInfo">
        <ul class="navbar-nav mr-auto nav-tabs">
          <li class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              href="#"
              id="navbarDropdown"
              role="button"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >
              用户名: {{ name }}
            </a>

            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <router-link to="/VipForum" class="dropdown-item"
                >我的首页</router-link
              >
              <router-link to="/UploadFile" class="dropdown-item"
                >上传资源</router-link
              >
              <router-link to="/VipForum" class="dropdown-item"
                >加入VIP</router-link
              >
              <router-link to="/VipForum" class="dropdown-item"
                >订阅更新通知</router-link
              >
              <router-link to="/VipForum" class="dropdown-item"
                >设置</router-link
              >
            </div>
          </li>
        </ul>
      </div>
    </nav>
  </div>

  <!-- Modal -->
  <div
    class="modal fade"
    id="exampleModal"
    tabindex="-1"
    aria-labelledby="exampleModalLabel"
    aria-hidden="true"
   
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">LOGIN IN</h5>
          <button
            type="button"
            class="close"
            data-dismiss="modal"
            aria-label="Close"
          >
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <form>
          <div class="modal-body">
            <div class="form-group">
              <label for="username">User Name</label>
              <input
                type="text"
                class="form-control"
                id="username"
                placeholder="please imput User Name"
                v-model="username"
              />
            </div>
            <div class="form-group">
              <label for="exampleInputPassword1">Password</label>
              <input
                type="password"
                class="form-control"
                id="exampleInputPassword1"
                placeholder="please imput Password"
                v-model="password"
              />
            </div>
            <div class="form-group form-check">
              <input
                type="checkbox"
                class="form-check-input"
                id="exampleCheck1"
              />
              <label class="form-check-label" for="exampleCheck1"
                >Check me out</label
              >
            </div>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn btn-secondary"
              data-dismiss="modal"
            >
              Close
            </button>

            <button
              type="submit"
              class="btn btn-primary"
              @click.prevent="login"
            >
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>

import { ref,inject  } from 'vue';
import $ from 'jquery'
export default {
  name: "HeaderView",
  setup() {
    // 获取provide实例

 const axios = inject('axios');

    // let state = ref({
    //   email:'',
    //   username: '',
    //   password: '',
    //   error: '',
    // })
    let username = ref('');
    let password = ref('');
    // let state = reactive({
    //   email:'',
    //   username: '',
    //   password: '',
    //   error: '',
    // });

    // const user = JSON.parse(localStorage.getItem('user'));
    const name =ref("未登录")

    const isLogged = ref(!!localStorage.getItem('user'));
    const login = () => {

        console.log("username",username);
        console.log("password",password);
        // console.log("myInput2.value",myInput2.value);

          axios.post('http://localhost:8801/users/login', {
          username: username.value,
          password: password.value,
        })
        .then((response) => {
          // 处理登录成功的逻辑
          console.log(response);
          console.log(response.data.data.status);

          if (response.data.code===200) {
          // 如果验证通过，将用户的登录状态设置为已登录，并关闭模态框
          // this.$emit("login");
          localStorage.setItem('right', response.data.data.rights);
          localStorage.setItem('user', JSON.stringify(response.data.data));
          console.log(response.data.data.rights);
          name.value=JSON.parse(localStorage.getItem('user')).username 
          isLogged.value = true;
          // 关闭模态框
          // this.$refs.modal.hide(); 
          $('#exampleModal').modal('hide');
        
        } else {
          // 如果验证失败，显示一个错误消息
          this.error = response.data.data.message;
          console.log(this.error);
          alert(this.error)
        }

        })
        .catch((error) => {
          // 处理登录失败的逻辑
          console.log(error);
        })
    }
    const logout=()=> {
      // 从 localStorage 中删除用户信息
      localStorage.removeItem('user');
      name.value='未登录';
      isLogged.value = false;
    }
    

    return {
      // ...state,
      username,
      password,
      name,
      isLogged,
      login,
      logout,

    }
  },

    // vue2写法：
  // data() {
  //   return {
  //     email:"",
  //     username: "",
  //     password: "",
  //     error: "",
  //   };
  // },
  // methods: {

    // async login2() {
    //   try {
    //     const response = await axios.post("http://localhost:8088/users/login", {
    //       email: this.email,
    //       password: this.password,
    //     });
    //     const token = response.data.token;
    //     // 将令牌保存在本地存储或使用 Vuex 存储

    //     // 简单的示例，可以根据具体情况进行调整。要验证和授权，可以将令牌保存在本地存储或使用 Vuex 存储，
    //     // 然后在每个请求中将其添加到标头中。例如：

    //     //         const token = localStorage.getItem('token');
    //     // const headers = { Authorization: `Bearer ${token}` };
    //     // const response = await axios.get('http://example.com/api/data', { headers });
    //     if (this.username === "admin" && this.password === "admin") {
    //       response.success = true;
    //     } else {
    //       response.message = "用户名或密码错误";
    //     }

    //     if (response.success) {
    //       // 如果验证通过，将用户的登录状态设置为已登录，并关闭模态框
    //       this.$emit("login");
    //       $("#exampleModal").modal("hide");
    //     } else {
    //       // 如果验证失败，显示一个错误消息
    //       this.error = response.message;
    //     }
    //   } catch (error) {
    //     console.error(error);
    //   }
    // },
  // },
};
</script>
<style>
@font-face {
  font-family: "cuteFont";
  src: url("../assets/font/cuteFont.ttf") format("truetype");
  /* 这里将字体文件的路径替换为自己的实际路径 */
}
.bg-light {
  background-color: aqua;
}
.container-fluid {
  padding: 0 !important;
}
.logo {
  height: auto;
  width: 220px;
  padding-left: 5px;
  margin: 0 !important;
  font-size: 12px;
}

.navbar-brand {
  font-size: 12px !important;
  font-style: italic;
  font-weight: normal;
  font-family: "cuteFont", "Franklin Gothic Medium", "Arial Narrow", Arial,
    sans-serif;
  /* 去掉四周的外边距 */
  /* margin: 0 !important;  */
  /* 去掉四周的内边距 */
  /* padding: 0 !important;  */
}
.figure-img {
  margin-bottom: 5px !important; /* 去掉四周的外边距 */
  padding: 0; /* 去掉四周的内边距 */
}

.navbar {
  height: auto;
  margin: 0 !important; /* 去掉四周的外边距 */
  padding: 0 !important; /* 去掉四周的内边距 */
}

.form-control-sl {
  width: 250px;
  height: 45px;
  font-size: 13px; /* 修改placeholder的字体大小 */
}

.userInfo {
  text-align: right;
  font-size: large;
  font-weight: 300;
  float: right;
}

/* model */

.modal-content {
  background-image: url("@/assets/296bbef3ac68e70b409e8a23df0b2a78.jpeg");
  background-size: cover;
  background-position: center center;
  color: white;
}

.modal-header {
  text-align: center;
}
.modal input {
  background-color: rgba(255, 255, 255, 0.6);
  opacity: 0.5;
}

.modal button {
  opacity: 0.7;
}
</style>
