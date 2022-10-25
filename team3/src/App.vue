<template>
  <Header></Header>
  <router-view></router-view>
  <Footer></Footer>
</template>

<script>
//import Welcome from './components/Welcome.vue'
import Header from '@/components/Header.vue'
import Footer from "@/components/Footer.vue";

export default {
  name: 'App',
  components: {
    Header,
    Footer,
  }
}
</script>

<style>

</style>
