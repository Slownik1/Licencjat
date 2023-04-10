import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { OutgoingComponent } from './outgoing/outgoing.component';
import { IncomingComponent } from './incoming/incoming.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [

  {path: 'outgoing', component: OutgoingComponent},
  {path: 'incoming', component: IncomingComponent},
  {path: 'list', component: ListComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
