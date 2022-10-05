<template>
  <Header/>
    <Welcome/>
  <Footer/>
</template>

<script>
import Header from'./components/Header.vue'
import Footer from './components/Footer.vue'
import Welcome from './components/Welcome.vue'

export default {
  name: 'App',
  components: {
    Header,
    Welcome,
    Footer,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
