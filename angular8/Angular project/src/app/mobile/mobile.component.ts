import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
selectedMobile;
  Mobiles=[{
    name:"Asus zenphone",
    imgUrl:"https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg"
  },
{
  name:"Samsung galaxy s5",
  imgUrl:"https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg"
},
{
  name:"Iphone 5",
  imgUrl:"https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg"
},
{
  name:"Iphone 4",
  imgUrl:"https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png"
}]
  constructor() { }

  ngOnInit() {
  }

  sendMobile(mobile)
  {
    console.log(mobile);
    this.selectedMobile= mobile;
  }
}
