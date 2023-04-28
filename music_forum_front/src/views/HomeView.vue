<template>
  <div class="container-fluid">


    <div class="main">
      <div
    id="carouselExampleSlidesOnly"
    class="carousel slide carousel-fade"
    data-ride="carousel"
  >
    <div class="carousel-inner">
      
      <div class="carousel-item active" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[0] + ')' }">
          <img src="@/assets/1-500x500.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>BOCCHI THE ROCKsadad!</h4>
            <p>结束乐队 (Kessoku Band) (FLAC WEB 48/24bits)</p>
          </div>
        </div>

        <div class="carousel-item" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[1] + ')' }">
          <img src="@/assets/2.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>fripSide 20周年記念</h4>
            <p>
              double
              Decades」nao、南條愛乃、上杉真央、阿部寿世[96kHz/24bit][FLAC]
            </p>
          </div>
        </div>
        <div class="carousel-item" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[2] + ')' }">
          <img src="@/assets/3.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>藍井エイル [心臟]</h4>
            <p>
              劇場版『刀剑神域 黯淡黄昏的谐谑曲
              冥き夕闇のスケルツォ』主題歌[96kHz/24bit][FLAC]
            </p>
          </div>
        </div>

        <div class="carousel-item" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[3] + ')' }">
          <img src="@/assets/4.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>原神-智妙明论之林</h4>
            <p>Forest of Jnana and Vidya 48khz/24bit【flac】</p>
          </div>
        </div>
        <div class="carousel-item" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[4] + ')' }">
          <img src="@/assets/5.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>すずめの戸締まり</h4>
            <p>RADWIMPS, 陣内一真 2022.11.11 OST 主题曲 [24bit 48kHz][FLAC]</p>
          </div>
        </div>

    </div>
  </div>
        <!-- <div class="carouselContainer data-interval">
          <div
            id="carouselExampleCaptions"
            class="carousel slide carousel-fade"
            data-bs-ride="carousel"
          >
            <ol class="carousel-indicators">
              <li
                data-target="#carouselExampleCaptions"
                data-slide-to="0"
                class="active"
              ></li>
              <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
              <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" data-bs-interval="3000">
              <div
                class="carousel-item active"
                :style="{ backgroundImage: 'url(' + imgUrls[0] + ')' }"
              >
                <img
                  src="@/assets/1-500x500.jpg"
                  class="d-block w-100"
                  alt="404"
                />
                <div class="carousel-caption d-none d-md-block">
                  <h4>BOCCHI THE ROCK!</h4>
                  <p>结束乐队 (Kessoku Band) (FLAC WEB 48/24bits)</p>
                </div>
              </div>
              <div
                class="carousel-item"
                :style="{ backgroundImage: 'url(' + imgUrls[1] + ')' }"
              >
                <img src="@/assets/2.jpg" class="d-block w-100" alt="404" />
                <div class="carousel-caption d-none d-md-block">
                  <h4>fripSide 20周年記念</h4>
                  <p>
                    double
                    Decades」nao、南條愛乃、上杉真央、阿部寿世[96kHz/24bit][FLAC]
                  </p>
                </div>
              </div>
              <div
                class="carousel-item"
                :style="{ backgroundImage: 'url(' + imgUrls[2] + ')' }"
              >
                <img src="@/assets/3.jpg" class="d-block w-100" alt="404" />
                <div class="carousel-caption d-none d-md-block">
                  <h4>藍井エイル [心臟]</h4>
                  <p>
                    劇場版『刀剑神域 黯淡黄昏的谐谑曲
                    冥き夕闇のスケルツォ』主題歌[96kHz/24bit][FLAC]
                  </p>
                </div>
              </div>

              <div
                class="carousel-item"
                :style="{ backgroundImage: 'url(' + imgUrls[3] + ')' }"
              >
                <img src="@/assets/4.jpg" class="d-block w-100" alt="404" />
                <div class="carousel-caption d-none d-md-block">
                  <h4>原神-智妙明论之林</h4>
                  <p>Forest of Jnana and Vidya 48khz/24bit【flac】</p>
                </div>
              </div>
              <div
                class="carousel-item"
                :style="{ backgroundImage: 'url(' + imgUrls[4] + ')' }"
              >
                <img src="@/assets/5.jpg" class="d-block w-100" alt="404" />
                <div class="carousel-caption d-none d-md-block">
                  <h4>すずめの戸締まり</h4>
                  <p>
                    RADWIMPS, 陣内一真 2022.11.11 OST 主题曲 [24bit 48kHz][FLAC]
                  </p>
                </div>
              </div>
            </div>
            <button
              class="carousel-control-prev"
              type="button"
              data-target="#carouselExampleCaptions"
              data-slide="prev"
            >
              <span
                class="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span class="sr-only">Previous</span>
            </button>
            <button
              class="carousel-control-next"
              type="button"
              data-target="#carouselExampleCaptions"
              data-slide="next"
            >
              <span
                class="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span class="sr-only">Next</span>
            </button>
          </div>
        </div> -->

        <table class="table table-striped table-sm">
          <thead>
            <tr class="titleTable">
              <div class="title1">
                <div class="titlediv">
                  <br />
                  <a class="subview" href="/">音频器材讨论及音乐共享</a>
                  &nbsp;<a class="subview" href="/">音频器材讨论及音乐共享</a
                  ><br />
                </div>

                “老板有没有HD800，来一打！！”<br />
                “想娶我女儿，买个大奥来先！！”<br />
                “你的耳塞好象助听器！！还是我大淘宝买的100块面条帅”<br /><br /><br /><br />
                第一次发言需要声望，这是论坛设定，我也很无奈。本人尽量长期在线处理发言申请<br />
                申请开放声望(发言权限)请通过点击发帖/回复受限后提供的声望申请连接申请<br />
              </div>

              <!-- <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th> -->
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>

              <td>TITLE</td>
              <td>发帖人/时间</td>
              <td>回复人/时间</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>Jacob</td>
              <td>Thornton</td>
              <td>@fat</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">4</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">5</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">6</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">7</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">8</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
            <tr>
              <th scope="row">9</th>
              <td>Larry</td>
              <td>the Bird</td>
              <td>@twitter</td>
            </tr>
          </tbody>
        </table>
      
    </div>

  
  </div>
</template>

<script>


export default {
  name: "HomeView",

  data() {
    return {
      imgUrls: [
        require("@/assets/bg1.jpg"), // 图片路径可以使用require方式引入
        require("@/assets/bg2.jpg"),
        require("@/assets/bg3.jpg"),
        require("@/assets/bg4.jpg"),
        require("@/assets/bg5.jpg"),
        // 其他图片路径
      ],
    };
  },
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
} */

/* main */
.carouselContainer {
  height: 550px;
  width: 100%;
  text-align: center;
}
/* .carousel{

} */
.carousel-item img {
  margin-top: 30px !important;
  margin-bottom: 30px !important;
  width: 500px !important;
  height: 500px !important;
  display: block;
  margin: 0 auto;
  border-radius: 30px;
}

.carousel-inner p {
  font-size: 17px;
}

/* table */
.titlediv {
  font-size: smaller;
  font-weight: bolder;
  text-align: left;
}
.table-striped tbody tr:nth-of-type(odd) {
  background-color: #fff8e7 !important ;
}

.table-striped tbody tr:nth-of-type(even) {
  background-color: #fff0cd;
  /*  */
}

.titleTable {
  text-align: center;
  font-size: 12px;
  font-family: "Gill Sans", "Gill Sans MT", Calibri, "Trebuchet MS", sans-serif;
  font-weight: normal;
}
.title1 {
  text-align: center;
  font-size: 12px;
  font-weight: normal;
  background-color: #fff8e7;
}
.table {
  font-size: 12px;
  font-weight: normal;
  text-align: center;
}
</style>
