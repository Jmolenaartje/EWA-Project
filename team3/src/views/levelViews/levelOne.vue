<template>

  <div class="masthead bg-primary text-white text-center" id="divBox">
    <div id="ten-countdown"></div>

    <div class="container">
      <div class="row">

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <p class="col stylingP">Blindheid<a><br>
                {{ total1 }}</a></p>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>


        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <P class="col"> Slechtziend <a>{{ total2 }}</a></P>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>



        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <P class="col"> doof <a>{{ total3 }}</a></P>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>


      </div>
      <div class="row">

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <P class="col">Amputatie  <a>{{ total4 }}</a></P>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <P class="col">blind <a>{{ total5 }}</a></P>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>


        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"><P @click="countMinus"> - </P></div>
            <P class="col"> Dwarslaesie <a>{{ total6 }}</a></P>
            <div class="col" id="rechts"><p @click="countPlus"> + </p></div>
          </div>
        </div>

      </div>
      <button class="btn btn-primary" id="btn" @click="countdown('ten-countdown', 30,0 )">start</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "levelOne",

  data() {
    return {
      total1: null,
      total2: null,
      total3: null,
      total4: null,
      total5: null,
      total6: null,
      stopTimer: null,
    }

  },
  methods: {
    countdown(elementName, minutes, seconds) {
      this.stopTimer = true;
      console.log("ismail");
      let element, endTime, hours, mins, msLeft, time;

      function twoDigits(n) {
        return (n <= 9 ? "0" + n : n);
      }

      function updateTimer() {
        msLeft = endTime - (+new Date);
        if (msLeft < 1000) {


          console.log(this.stopTimer)
          element.innerHTML = "Time is up!";
          console.log(this.total);

        } else {

          time = new Date(msLeft);
          hours = time.getUTCHours();
          mins = time.getUTCMinutes();
          element.innerHTML = (hours ? hours + ':' + twoDigits(mins) : mins) + ':' + twoDigits(time.getUTCSeconds());
          setTimeout(updateTimer, time.getUTCMilliseconds() + 500);

        }
      }


      element = document.getElementById(elementName);
      endTime = (+new Date) + 1000 * (60 * minutes + seconds) + 500;
      updateTimer();

    },

    countPlus() {

      if (this.stopTimer) {
        this.total1++;
      }
    },
    countMinus() {

      if (this.stopTimer) {
        if (this.total1 > 0) {
          this.total1--;
        }
      }
    },


  }
}


</script>

<style scoped>
.counterBox {

  margin: 10px;

  height: 100px;
  width: 100px;
  background-color: red;
  border-radius: 150px;
}

#links {

  background-color: #ee0000;
  height: 98px;

  max-width: 100px;
  border-radius: 150px 0 0 150px;

}

p {
  /*margin: 20px;*/
  text-align: center;
  color: #ffffff;
  font-weight: bold;
  font-size: 40px;
}

#rechts {

  background-color: #ee0000;
  text-align: center;
  height: 98px;
  max-width: 100px;
  border-radius: 0 150px 150px 0;

}
#btn{
  background-color: red;
  width: 100px;
  height: 50px;
  font-size: 25px;
}

#ten-countdown {

  display: inline;
  padding: 5px;
  color: #ff0000;
  font-family: Verdana, sans-serif, Arial;
  font-size: 150px;
  font-weight: bold;
  text-decoration: none;
}
a{
  padding-bottom: 20px;
}
.stylingP{

}


</style>