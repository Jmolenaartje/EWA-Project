<template>
  <div class="masthead bg-primary text-white text-center" id="divBox">
    <div id="ten-countdown"></div>
    <input type="checkbox" class="rounded" v-model="checked" id="checkbox" />
    <span  class="h1  ">ov</span>

    <div class="container">
      <div class="row justify-content-center mx-2">
        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus"> - </P>
            </div>
            <p class="col">
              handicap1<a
                ><br />
                {{ total1 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus">+</p>
            </div>
          </div>
        </div>

        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus2"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total2 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus2">+</p>
            </div>
          </div>
        </div>
        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus3"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total3 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus3">+</p>
            </div>
          </div>
        </div>
      </div>
      <div class="row justify-content-center mx-2">
        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus4"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total4 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus4">+</p>
            </div>
          </div>
        </div>

        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus5"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total5 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus5">+</p>
            </div>
          </div>
        </div>
        <div
          class="counterBox col-lg-3 m-1 counterBox rounded"
          v-bind:class="checked ? 'background-checked' : 'bg-danger'"
        >
          <div class="row">
            <div class="col p-1 display-5" id="links">
              <P @click="countMinus5"> - </P>
            </div>
            <p class="col">
              Blindheid<a
                ><br />
                {{ total5 }}</a
              >
            </p>
            <div class="col p-1 display-5" id="rechts">
              <p @click="countPlus5">+</p>
            </div>
          </div>
        </div>
      </div>
      <div class="buttons">
        <button
          class="btn m-1 border btn-primary"
          id="btn"
          @click="countdown('ten-countdown', 5, 0)"
        >
          start
        </button>
          <button class="btn m-1 border btn-primary" @click="showModal = true">Save</button>
         <SavedModal v-show="showModal" />

      </div>
    </div>
  </div>
</template>

<script>
import SavedModal from "../../components/Level2Modal.vue";

export default {
 
  name: "levelOne",

  data() {
    return {
      total1: 0,
      total2: 0,
      total3: 0,
      total4: 0,
      total5: 0,
      totalscore: 0,
      checked: false,
      showModal: false,
    };
  },
  components: {
    SavedModal,
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
    countPlus3() {
      if (this.stopTimer) {
        this.total3++;
      }
    },
    countPlus4() {
      if (this.stopTimer) {
        this.total4++;
      }
    },
    countPlus5() {
      if (this.stopTimer) {
        this.total5++;
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
        if (this.total2 > 0) {
          this.total2--;
        }
      }
    },
    countMinus3() {
      if (this.stopTimer) {
        if (this.total3 > 0) {
          this.total3--;
        }
      }
    },
    countMinus4() {
      if (this.stopTimer) {
        if (this.total4 > 0) {
          this.total4--;
        }
      }
    },
    countMinus5() {
      if (this.stopTimer) {
        if (this.total5 > 0) {
          this.total5--;
        }
      }
    },
  },
};
</script>

<style scoped>
a {
  padding-bottom: 20px;
}
.background-checked {
  background-color: rgb(91, 91, 167);
}
#ten-countdown {
  display: inline;
  padding: 5px;
  font-family: Verdana, sans-serif, Arial;
  font-size: 4em;
  font-weight: bold;
  text-decoration: none;
}
</style>
