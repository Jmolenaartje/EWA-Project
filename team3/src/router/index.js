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
import gameTwoSubSub from "@/views/Admin/subComponents/gameTwoSubSub";
import adminUserList from "@/views/Admin/adminUserList";
import adminEditProfilePage from "@/views/Admin/adminEditProfilePage";
import adminEditProfilePageWithId from "@/views/Admin/adminEditProfilePageWithId";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
    { path: "/admin-users", component: adminUserList},
    { path: "/admin-edit-user", component: adminEditProfilePage, children:[{
        path: ":id", component: adminEditProfilePageWithId,
        }]},
    { path: "/admin", component: adminEditGame,
    children: [
        { path: "game-1", component: gameOneSub, props:true},
        { path: "game-2", component: gameTwoSub,
            children: [{path: ':id', component: gameTwoSubSub}]},
        { path: "game-3", component: gameThreeSub},
        { path: "game-4", component: gameFourSub},
        { path: "game-5", component: gameFiveSub},
        { path: "game-6", component: gameSixSub},
        // {path: '/:pathMatch(.*)', redirect: '/admin/'},
    ]},
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})