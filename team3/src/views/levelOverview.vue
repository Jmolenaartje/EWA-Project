<template>
  <div class="masthead bg-primary text-white text-center" id="divBox">
    <div class="container">

      <div>
        <div class="row-level" id="level-1">
          <router-link to="/levelOne">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel1.png">
          <img class="levelLogoImages" id="counterImg"  src="../assets/img/logoLevels/counterLevel.png">
          <div class="levelBox" ><p class="levelText">level 1</p></div>
            </router-link>

        </div>
        <div class="row-level">
          <router-link to="/levelTwo">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel2.png">
          <img class="levelLogoImages" id="safariImg"  src="../assets/img/logoLevels/Q&a.png">
          <div class="levelBox"><p class="levelText">level 2</p></div>
          </router-link>
        </div>
        <div class="row-level">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel3.png">
          <img class="levelLogoImages" id="safariImg"  src="../assets/img/logoLevels/safariLevel.png">
          <div class="levelBox"><p class="levelText">level 3</p>
          </div>
        </div>
        <div class="row-level">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel4.png">
          <img class="levelLogoImages" id="safariImg"  src="../assets/img/logoLevels/feedback.png">
          <div class="levelBox"><p class="levelText">level 4</p></div>
        </div>
        <div class="row-level">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel5.png">
          <img class="levelLogoImages" id="safariImg"  src="../assets/img/logoLevels/meetingRound.png">
          <div class="levelBox"><p class="levelText">level 5</p></div>
        </div>
        <div class="row-level">
          <img class="levelNumImages" src="../assets/img/levelNumbers/numLevel6.png">
          <img class="levelLogoImages" id="safariImg"  src="../assets/img/logoLevels/bossMeeting.png">
          <div class="levelBox"><p class="levelText">level 6</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: "levelOverview",
  methods: {
    clickEvent() {
      // this.$router.push("/levelOne");
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

.levelNumImages {
  float: left;
  padding: 15px;
}
.levelLogoImages{
  float: right;
  margin-right: 40px;
  height: 150px;
  padding-top: 10px;
}


.levelBox {
  padding: 30px;
  height: 150px;
  background-color: #fff;
  float: bottom;
  border-radius: 10px;
}

@font-face {
  src: url("../assets/font/Silkscreen/Silkscreen-Regular.ttf");
  font-family: Slikscreen;

}



.levelText {
  font-family: Slikscreen,serif;
  font-style: italic;

  color: red;

  font-weight: 700;
  font-size: 80px;
  align-content: center;
  padding-bottom: 30px;
}
@media screen and (max-width: 500px) {
  .levelText{
    display: none;

  }
  .levelLogoImages{

    position: center;
    float: initial;

  }
  .levelBox{
    display: none;
  }

  .levelLogoImages{
    display: none;
  }
  .levelNumImages{
    float: none;
  }

}


</style>
