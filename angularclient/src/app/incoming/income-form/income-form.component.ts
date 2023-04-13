import {Component, NgModule} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IncomeService } from '../income.service';
import { Income } from '../income';

@Component({
  selector: 'app-income-form',
  templateUrl: './income-form.component.html',
  styleUrls: ['./income-form.component.css']
})

export class IncomeFormComponent {

  income: Income;

  constructor(
    private route: ActivatedRoute,
    private  router: Router,
    private incomeService: IncomeService) {
    this.income = new Income();
  }

  onSubmit(){
    this.incomeService.save(this.income).subscribe(result =>this.gotoIncomeList());
  }

  gotoIncomeList(){
    this.router.navigate(['/list']);
  }

}
