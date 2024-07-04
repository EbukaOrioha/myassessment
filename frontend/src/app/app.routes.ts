import { Routes } from '@angular/router';
import { TravelComponent } from './travel/travel.component';
import { NewuserComponent } from './newuser/newuser.component';
import { FundcardComponent } from './fundcard/fundcard.component';

export const routes: Routes = [{'path':'newuser', component:NewuserComponent}, {'path':'fundcard', component:FundcardComponent},{'path':'travel', component:TravelComponent}];
