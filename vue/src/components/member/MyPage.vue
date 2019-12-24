<template>
  <div class="back">
      <div align = "center"><h1><input type="text" v-model="name"/>{{name}}님의 Mypage</h1><input type="button" value="로그아웃" @click="logout"/></div>
      <div class="sub">
        <div class="pull-left rt size" >
           <fieldset style=" margin-top: 1%; height: 31.5%;border: 2px solid black;">
             <legend><h3>개인 정보</h3></legend>
              <div  style="float: left; width: 20%;"> 비번 </div> <div  style="float: none; width: 70%;"> {{passwd}}</div>
               <div  style="float: left; width: 20%;"> 생일 </div> <div  style="float: none; width: 70%;"> {{birthday}}</div>
                <div  style="float: left; width: 20%;"> 성별 </div><div  style="float: none; width: 70%;"> {{gender}}</div>
                <div  style="float: left; width: 20%;"> 학년 </div><div  style="float: none; width: 70%;"> {{hak}}</div>
                <div  style="float: left; width: 20%;"> 반 </div><div  style="float: none; width: 70%;"> {{ban}}</div>
                <div  style="float: left; width: 20%;"> 점수 </div><div  style="float: none; width: 70%;"> {{score}}</div>
           </fieldset>
           <input type="button" value="수정페이지 이동" @click="goUpdate"/>
          
        </div>
        
              <a href="#" @click.prevent="Withdrawal"><h2 align="center">회원탈퇴</h2></a>
       
    </div>
  </div>
</template>
<script>
import {store} from "../../store" 
/* import axios from "axios" */
export default{
		data(){
			return{
   name: store.state.name,
    birthday: store.state.birthday,
    gender: store.state.gender,
    hak: store.state.hak,
		ban: store.state.ban,
		score: store.state.score,
    context:'http://localhost:8080/',
    userid : store.state.loginedUid,
    loginedPwd:store.state.loginedPwd,
    loginedUid:store.state.loginedUid,
    passwd:store.state.loginedPwd,
    pwdUpdate : '',
    scoreUpdate:'',
    hakUpdate:'',
    banUpdate:'',
   /*  person : store.state.person */
		}
  },
  methods:{
    goUpdate(){
    alert('업데이트 페이지 넘어가는것')
     this.$router.push({path:'/myPageUpdate'})
  }
  }
 
}
</script>
<style scoped>
.back {width: 1100px; margin: 0 auto;}
.sub {width: 70%; height: 600px; margin: 0 auto; text-align: center;}
.pull-left {float: left;}
.pull-right {float: right;}
.top {margin-top: 1%;}
.rt {margin-right: 1%;}
.size {width: 49.5%; height: 100%;}
</style>