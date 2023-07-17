import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { OutgoingComponent } from './outgoing/outgoing.component';
import { IncomeFormComponent } from './incoming/income-form/income-form.component';
import { OutgoingFormComponent } from './outgoing/outgoing-form/outgoing-form.component';
import { ListComponent } from './list/list.component';
import { HomeComponent } from './home/home.component';
import { AuthenticationGuard } from './authentication.guard';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  {path: 'outgoing', component: OutgoingComponent},
  {path: 'o', component: OutgoingFormComponent},
  {path: 'i', component: IncomeFormComponent},
  {path: 'list', component: ListComponent},

  {path: '', canActivate:[AuthenticationGuard], children: [
    { path: '', component: HomeComponent },
    { path: 'login', component: LoginComponent },
    { path: '**', redirectTo: '' }
  ]}

];

@NgModule({
  imports: [RouterModule.forRoot(routes),
  FormsModule],
  exports: [RouterModule]

})
export class AppRoutingModule { }
