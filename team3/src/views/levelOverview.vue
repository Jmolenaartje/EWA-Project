<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container">
      <div>
        <div class="row-level" id="level-1">
          <div class="level" @click="clickEvent"> level1</div>
        </div>
        <div class="row-level">
          <div class="level"> level2</div>

        </div>
        <div class="row-level">
          <div class="level"> level3</div>
        </div>
        <div class="row-level">
          <div class="level"> level4</div>
        </div>
        <div class="row-level">
          <div class="level"> level5</div>
        </div>
        <div class="row-level">
          <div class="level"> level6</div>
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

.level {
  padding: 30px;
  max-height: 100px;
  background-color: #3d3d3d;
  float: bottom;
  border-radius: 10px;
}


</style>
