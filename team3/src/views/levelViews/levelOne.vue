<template>

  <div class="masthead bg-primary text-white text-center" id="divBox">
    <div class="container">
      <div class="row">

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind <a> counter</a> </P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind</P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>


        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind</P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>

      </div>
      <div class="row">

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind <a> counter</a> </P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>

        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind</P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>


        <div class="col counterBox">
          <div class="row">
            <div class="col" id="links"> <P> min </P></div>
            <P class="col"> blind</P>
            <div class="col" id="rechts"><p> plus </p></div>
          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "levelOne",

}
</script>

<style scoped>
.counterBox {

  margin: 10px;
  border-style: solid;
  height: 100px;
  width: 100px;
  background-color: red;
  border-radius: 150px;
}

#links {
  border-style: solid;
  background-color: yellow;
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
  border-style: solid;
  background-color: black;
  text-align: center;
  height: 98px;
  max-width: 100px;
  border-radius: 0 150px 150px 0;

}


</style>