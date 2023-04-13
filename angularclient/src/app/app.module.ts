import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OutgoingComponent } from './outgoing/outgoing.component';
import { IncomingComponent } from './incoming/incoming.component';
import { ListComponent } from './list/list.component';
import { IncomingListComponent } from './incoming/incoming-list/incoming-list.component';
import { IncomeFormComponent } from './incoming/income-form/income-form.component';

@NgModule({
  declarations: [
    AppComponent,
    OutgoingComponent,
    IncomingComponent,
    ListComponent,
    IncomingListComponent,
    IncomeFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
