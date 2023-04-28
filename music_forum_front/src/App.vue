<template>
 <div class="App">
<Header></Header>
<router-view/>
<Footer></Footer>
 </div>

</template>
<script>

// @ is an alias to /src
import Footer from '@/components/Footer.vue'
import Header from '@/components/Header.vue'

export default {
  name: 'App',
  components: {
    Header,
    Footer
   

  }
}
</script>

<style>

</style>
