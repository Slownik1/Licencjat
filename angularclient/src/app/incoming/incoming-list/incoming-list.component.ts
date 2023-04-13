import {Component, OnInit} from '@angular/core';
import { Income } from '../income';
import { IncomeService } from '../income.service';
@Component({
  selector: 'app-incoming-list',
  templateUrl: './incoming-list.component.html',
  styleUrls: ['./incoming-list.component.css']
})
export class IncomingListComponent implements OnInit{

  incomes: Income[];

  constructor(private incomeService: IncomeService) {
  }

  ngOnInit() {

    this.incomeService.findAll().subscribe(data=> {this.incomes = data});

  }

}
