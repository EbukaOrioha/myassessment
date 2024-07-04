import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Travel } from './travel';
import {TravelService } from './travel.service';
import  {NgForm} from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

@Component({
  selector: 'app-travel',
  standalone: true,
  imports: [RouterOutlet,FormsModule, CommonModule, RouterModule],
  templateUrl: './travel.component.html',
  styleUrl: './travel.component.scss'
})
export class TravelComponent implements OnInit { 
  title = 'myapp';
  cardpin = '';
  
constructor(private travelservice: TravelService){}
ngOnInit(): void {
 
}
public travel(addForm: NgForm): void{

this.travelservice.journey(addForm.value).subscribe(
 (response:Travel)=>{
   this.cardpin = response.cardPin;
 },
 (error:HttpErrorResponse)=>{
   alert(error.message);
   
 }

)
}

}

