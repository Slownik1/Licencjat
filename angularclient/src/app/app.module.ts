import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OutgoingComponent } from './outgoing/outgoing.component';
import { ListComponent } from './list/list.component';
import { IncomeFormComponent } from './incoming/income-form/income-form.component';
import { HttpClientModule } from '@angular/common/http';
import { OutgoingFormComponent } from './outgoing/outgoing-form/outgoing-form.component';
import { NgxChartsModule }from '@swimlane/ngx-charts';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    OutgoingComponent,
    ListComponent,
    IncomeFormComponent,
    OutgoingFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    NgxChartsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
