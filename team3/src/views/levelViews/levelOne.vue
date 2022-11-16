<template>
  <div class="masthead bg-primary text-white text-center" id="divBox">
    <div id="ten-countdown"></div>

    <div class="container">
    
      <div class="row justify-content-center mx-2">
        <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
        
         <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
         <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
        
      </div>
          <div class="row justify-content-center mx-2">
        <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
        
         <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
         <div class="col-lg-3 m-1 counterBox border border-danger rounded bg-danger ">
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>
        
      </div>
      <button
        class="btn btn-primary"
        id="btn"
        @click="countdown('ten-countdown', 30, 0)"
      >
        start
      </button>
    </div>
  </div>
</template>

<script>
export default {
  name: "levelOne",

  data() {
    return {
      total1: 0,
      total2: null,
      total3: null,
      total4: null,
      total5: null,
      total6: null,
      stopTimer: null,
    };
  },
  methods: {
    countdown(elementName, minutes, seconds) {
      this.stopTimer = true;
      console.log("ismail");
      let element, endTime, hours, mins, msLeft, time;

      function twoDigits(n) {
        return n <= 9 ? "0" + n : n;
      }

      function updateTimer() {
        msLeft = endTime - +new Date();
        if (msLeft < 1000) {
          console.log(this.stopTimer);
          element.innerHTML = "Time is up!";
          console.log(this.total);
        } else {
          time = new Date(msLeft);
          hours = time.getUTCHours();
          mins = time.getUTCMinutes();
          element.innerHTML =
            (hours ? hours + ":" + twoDigits(mins) : mins) +
            ":" +
            twoDigits(time.getUTCSeconds());
          setTimeout(updateTimer, time.getUTCMilliseconds() + 500);
        }
      }

      element = document.getElementById(elementName);
      endTime = +new Date() + 1000 * (60 * minutes + seconds) + 500;
      updateTimer();
    },

    countPlus() {
      if (this.stopTimer) {
        this.total1++;
      }
    },
    countPlus2() {
      if (this.stopTimer) {
        this.total2++;
      }
    },
    countMinus() {
      if (this.stopTimer) {
        if (this.total1 > 0) {
          this.total1--;
        }
      }
    },
    countMinus2() {
      if (this.stopTimer) {
        if (this.total1 > 0) {
          this.total2--;
        }
      }
    },
  },
};
</script>

<style scoped>
#ten-countdown {
  display: inline;
  padding: 5px;
  font-family: Verdana, sans-serif, Arial;
  font-size: 4em;
  font-weight: bold;
  text-decoration: none;
}
a {
  padding-bottom: 20px;
}
</style>
