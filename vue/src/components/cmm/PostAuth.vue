<template>
<div id="auth-box">	
     <a @click.prevent="logout"><h3>로그아웃</h3></a>
     <a @click.prevent="withdrawal"><h3>회원탈퇴</h3></a>
</div>
</template>
<script>
import {store} from "../../store" 
import axios from "axios"
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
        }
    },
   methods:{
    logout(){
      alert('로그아웃 알럿')
      store.state.loginedUid= '';
      store.state.loginedPwd= '';
      store.state.name='';
      store.state.birthday='';
      store.state.id='';
      store.state.gender='',
      store.state.hak='',
      store.state.ban='',
      store.state.score=''
      store.state.authCheck= false
       this.$router.push({path:'/home'})
       alert(`${store.state.loginedUid},${store.state.loginedPwd},${store.state.name},${store.state.birthday}`)
    },
    withdrawal(){
      alert('회원 탈퇴')
    /*   let url =`${this.context}/withdrawal/${store.state.loginedUid}`
      let data={
       userid : store.state.loginedUid,
       passwd : store.state.loginedPwd
      }
      let headers={
        'authorization': 'JWT fefege..',
              'Accept' : 'application/json',
              'Content-Type': 'application/json'
      } */
     /*  axios.post(url, data, headers) */
     axios.delete(`${this.context}/withdrawal/${this.userid}`)
     .then(()=>{
       alert('탈퇴성공')
        store.state.authCheck= false
       this.$router.push({path:'/home'})
      }).catch(()=>{
        alert('AXIOS 실패')
      })
      
    }
   }
}
</script>