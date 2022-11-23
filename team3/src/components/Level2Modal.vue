<template>
<transition name="modal-fade">
   <div class="modal-overlay" @click="$emit('close-modal')">
    <h1>kaas</h1>
    <div class="close">
      <h1>Score board</h1>
      <h3>hendicap 1:</h3>{{message}}
      <h3>hendicap 2:</h3>{{message2}}
      <h3>hendicap 3:</h3>{{message3}}
      <h3>hendicap 4:</h3>{{message4}}
      <h3>total score :</h3>{{message5}}
      <router-link to="/" class="btn m-1 border btn-primary" >Go Home</router-link> <button  class="btn m-1 border btn-primary" @click="$emit('close-modal')" >Go Back</button>

    </div>
  </div>
  </transition>
</template>


<style scoped>
.modal-overlay {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: center;
  background-color: #929292da;
}
.close {
  justify-content: center;
  margin-top:10em
}
</style>
<script>


</script>


