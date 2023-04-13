import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { OutgoingComponent } from './outgoing/outgoing.component';
import { IncomeFormComponent } from './incoming/income-form/income-form.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [

  {path: 'outgoing', component: OutgoingComponent},
  {path: 'i', component: IncomeFormComponent},
  {path: 'list', component: ListComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes),
  FormsModule],
  exports: [RouterModule]

})
export class AppRoutingModule { }
