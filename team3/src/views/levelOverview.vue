<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container">
      <div>
        <div class="row-level" id="level-1">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel1.png">
          <div class="levelBox" @click="clickEvent"><p class="levelText">level 1</p></div>
        </div>
        <div class="row-level">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel2.png">
          <div class="levelBox"><p class="levelText">level 2</p></div>
        </div>
        <div class="row-level">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel3.png">
          <div class="levelBox"><p class="levelText">level 3</p>
          </div>
        </div>
        <div class="row-level">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel4.png">
          <div class="levelBox"><p class="levelText">level 4</p></div>
        </div>
        <div class="row-level">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel5.png">
          <div class="levelBox"><p class="levelText">level 5</p></div>
        </div>
        <div class="row-level">
          <img class="levelImages" src="../assets/img/levelNumbers/numLevel6.png">
          <div class="levelBox"><p class="levelText">level 6</p>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>

<script>

export default {
  name: "levelOverview",
  methods: {
    clickEvent() {
      this.$router.push("/home");
    }
  }
}

</script>


<style scoped>
.row-level {
  min-height: 100px;
  padding: 20px;
  position: relative;
}

.levelImages {
  float: left;
  padding: 15px;
}

.levelBox {
  padding: 30px;
  height: 150px;
  background-color: #fff;
  float: bottom;
  border-radius: 10px;
}

.levelText {
  color: red;
  position: center;
  font-family: "sans-serif";
  font-weight: 700;
  font-size: 80px;
  align-content: center;
}
@media screen and (max-width: 500px) {
  .levelText{
    display: none;
  }
  .levelImages{
    align: center;
    position: center;
    float: initial;

  }
  .levelBox{
    display: none;
  }

}


</style>
