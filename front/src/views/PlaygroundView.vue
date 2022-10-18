<script setup lang="ts">

import {useRouter} from "vue-router";

const router = useRouter();

const moveToKrustyKrab = () => {
  console.log(123)
  router.push({name: "krustyKrab_home"})
}

</script>

<template>

  <div>
    <img src="../assets/집게리아.jfif" @click="moveToKrustyKrab()"
         style="width:15vw; min-width: 140px;"/>
  </div>

</template>

<style>


</style>

