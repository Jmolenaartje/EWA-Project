import { createRouter, createWebHashHistory } from 'vue-router'

import Welcome from '@/components/Welcome.vue'
import profilePage from "@/components/profilePage.vue";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/profilePage", component: profilePage},
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})