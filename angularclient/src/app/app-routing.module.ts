import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { OutgoingComponent } from './outgoing/outgoing.component';

const routes: Routes = [

  {path: 'outgoing', component: OutgoingComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
