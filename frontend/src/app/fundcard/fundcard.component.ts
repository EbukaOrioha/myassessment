import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CardAccount } from './cardaccount';
import {CardAccountService } from './cardaccount.service';
import  {NgForm} from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';


@Component({
  selector: 'app-fundcard',
  standalone: true,
  imports: [RouterOutlet,FormsModule, CommonModule, RouterModule],
  templateUrl: './fundcard.component.html',
  styleUrl: './fundcard.component.scss'
})
export class FundcardComponent implements OnInit { 
  title = 'myapp';
  cardpin = '';
  
constructor(private cardaccountservice: CardAccountService){}
ngOnInit(): void {
 
}
public fundcard(addForm: NgForm): void{

this.cardaccountservice.createfund(addForm.value).subscribe(
 (response:CardAccount)=>{
   this.cardpin = response.cardPin;
 },
 (error:HttpErrorResponse)=>{
   alert(error.message);
   
 }

)
}

}
