<template>

<div
    id="carouselExampleSlidesOnly"
    class="carousel slide carousel-fade"
    data-ride="carousel"
  >
    <div class="carousel-inner">
      
      <div class="carousel-item active" data-interval="3000" :style="{ backgroundImage: 'url(' + imgUrls[0] + ')' }">
          <img src="@/assets/1-500x500.jpg" class="d-block w-100" alt="404" />
          <div class="carousel-caption d-none d-md-block">
            <h4>BOCCHI THE ROCK!</h4>
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

 

  <div class="foot">
    
      <p>
        © 2023 <a href="https://www.jpbeta.cc">音乐资源/设备共享论坛</a>. All
        Rights Reserved. <span id="span_dt_dt">Loading...</span><br />Theme
        Kratos Made by Vtrois Modified by MOEDOG |
        <a href="https://www.jpbeta.cc/sitemap.xml" target="_blank">Sitemap</a>
        | >
      </p>
      <div class="nav">
      <nav class="navbar navbar-expand-lg navbar-black bg-black ">
        <a class="navbar-brand" href="#">友情链接</a>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <br />
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="http://www.acgjc.com/">漫音社</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://www.jpbeta.cc/"
                >JPbeta日本文化资讯站
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="http://acg17.com/">ACG17宅一 起</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="http://www.pixivic.com/"
                >pixiv免费高级会员搜索</a
              >
            </li>
            <li class="nav-item">
              <a class="nav-link" href="http://www.77acg.com/">77动漫</a>
            </li>
          </ul>
        </div>
      </nav>
    </div>

    
  </div>


</template>

<script>
export default {
  name: "FooterView",
  data() {
    return {
      imgUrls: [
        require("@/assets/BG.jpg"), // 图片路径可以使用require方式引入
        // require("@/assets/bg2.jpg"),
        // require("@/assets/bg3.jpg"),
        // require("@/assets/bg4.jpg"),
        // require("@/assets/bg5.jpg"),
        // 其他图片路径
      ],
    };
  },
};
</script>
<style>
.foot {
  height: 200px;
  text-align: center;
  font-family: -apple-system, BlinkMacSystemFont, opensans, Optima,
    "Microsoft Yahei", sans-serif;
  line-height: 1.8;
  font-size: 13px;
  background: #23282d;
  color: azure;
  font-weight: 300;
}
.foot p{
  height: 100px;
  line-height:100px;
}
.navbar{
  width: 100% !important;

}
.nav{
  text-align: center;
  width: 100%;
  background: #23282d !important;
  color: azure !important; 
}

</style>
