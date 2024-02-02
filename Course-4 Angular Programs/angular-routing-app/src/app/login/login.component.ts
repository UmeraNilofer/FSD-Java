import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Login } from '../login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
msg:string=""
  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl()
  })

  logins:Array<Login>=[]
  constructor(public router:Router,public ls:LoginService){}   // DI for Router API which help to navigate to another component 
  
  // this method called only once when component loaded....
ngOnInit(): void {
  this.ls.loadAllUsers().subscribe({
    next:(data:any)=>this.logins=data,
    error:(error:any)=>console.log(error),
    complete:()=>console.log("all login details loaded...")
  })
}
  
  signIn(): void {
    let login = this.loginRef.value;

    if(login.emailid=="akash@gmail.com" && login.password=="123"){
        this.router.navigate(["home"]);
    }else {
        this.msg="Failure try once again";
    }

  }
}
