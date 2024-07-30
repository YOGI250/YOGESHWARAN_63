import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
 flag:boolean;
 vehicles:string[];

 constructor(){
  this.flag=true;
  this.vehicles = ["Twowheeler","ThreeWheeler","FourWheeler"];
 }
 changeFlag(){
  this.flag=!this.flag;
 }
 
}
  