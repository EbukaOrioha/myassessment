import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Customer } from './customer';
import { CustomerService } from './customer.service';
import  {NgForm} from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { routes } from './app.routes';
import { NewuserComponent } from './newuser/newuser.component';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FormsModule, CommonModule, RouterModule, NewuserComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
      title = 'myapp';
       cardpin = '';
       
  constructor(private customerService: CustomerService){}
  ngOnInit(): void {
      
  }
  public addCustomers(addForm: NgForm): void{

    this.customerService.addCustomer(addForm.value).subscribe(
      (response:Customer)=>{
        this.cardpin = response.cardPin;
      },
      (error:HttpErrorResponse)=>{
        alert(error.message);
        
      }

    )
  }

}
