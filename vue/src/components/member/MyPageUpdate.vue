<template>
<div>
	<h3>mypageupdate</h3>
	<legend><h3>학생부 관리 </h3></legend>
               <div  style="float: left; width: 20%;"> 비번 </div><input type="text"  size="20" placeholder="변경할 비번" v-model="pwdUpdate"  style="float: center; width: 70%;">
               <div  style="float: left; width: 20%;"> 학년 </div><input type="text" size="20" placeholder="변경할 학년  입력" v-model="hakUpdate" style="float: center;width: 70%;"> 
                <div  style="float: left; width: 20%;"> 반 </div><input type="text" size="20" placeholder="변경할 반 입력" v-model="banUpdate"  style="float: center;width: 70%;"> 
                <div  style="float: left; width: 20%;"> 성적  </div><input type="text" size="20" placeholder="변경할 성적 입력" v-model="scoreUpdate"   style="float: center;width: 70%;"> 
                <br/><br/>                
                <button style="height: 20%; width: 70%; float: none;" @click.prevent="update">수정</button>
</div>
</template>
<script>
import {store} from "../../store" 
import axios from "axios"
export default{
	data(){
		return{
		id:store.state.id,
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
		update(){
			alert(`${store.state.id}`)
			store.state.id=this.id
			store.state.loginedPwd=this.pwdUpdate
			store.state.score=this.scoreUpdate
			store.state.hak=this.hakUpdate
			store.state.ban=this.banUpdate
			let url =`${this.context}/update`
			let data={
				id:this.id,
				userid:this.userid,
				passwd:this.pwdUpdate,
				name:this.name,
				birthday:this.birthday,
				gender:this.gender,
				hak:this.hakUpdate,
				ban:this.banUpdate,
				score:this.scoreUpdate,
			}
			let headers={
				'authorization': 'JWT fefege..',
              'Accept' : 'application/json',
              'Content-Type': 'application/json'
			}
			axios.post(url,data,headers)
		}
	}
}
</script>
<style scoped>
</style>