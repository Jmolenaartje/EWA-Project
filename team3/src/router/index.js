import { createRouter, createWebHashHistory } from 'vue-router'


import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";

import adminEditGame from "@/views/Admin/adminEditGame";
import gameOneSub from "@/views/Admin/subComponents/gameOneSub";
import gameTwoSub from "@/views/Admin/subComponents/gameTwoSub";
import gameThreeSub from "@/views/Admin/subComponents/gameThreeSub";
import gameFourSub from "@/views/Admin/subComponents/gameFourSub";
import gameFiveSub from "@/views/Admin/subComponents/gameFiveSub";
import gameSixSub from "@/views/Admin/subComponents/gameSixSub";
import levelOne from "@/views/levelViews/levelOne";
import SignIn from "../components/SignIn.vue";
import RegisterPage from "../components/RegisterPage.vue";


const routes = [
    { path: "/home", component: Welcome },
    { path: "/", redirect: "/home"},
    { path: "/profilePage", component: profilePage},
    { path: "/signIn", component: SignIn},
    { path: "/registerPage", component: RegisterPage},
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},

    { path: "/admin", component: adminEditGame,
    children: [
        {path: "game-1", component: gameOneSub, props:true},
        {path: "game-2", component: gameTwoSub},
        {path: "game-3", component: gameThreeSub},
        {path: "game-4", component: gameFourSub},
        {path: "game-5", component: gameFiveSub},
        {path: "game-6", component: gameSixSub},
        {path: '/:pathMatch(.*)', redirect: '/admin/'},
    ]},
    { path: "/levelOne", component: levelOne},
    { path: "/", redirect: "/home"},
];
export const router = createRouter({
    history: createWebHashHistory(),
    routes
})