import { Component, OnInit } from '@angular/core';
import { Outcome } from '../outgoing/outcome';
import { Income } from '../incoming/income';
import { IncomeService } from '../incoming/income.service';
import { OutgoingService } from '../outgoing/outgoing.service';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{

  incomes: Income[];
  outcomes: Outcome[];


  constructor(private incomeService: IncomeService, 
              private outgoingService: OutgoingService){ }

  ngOnInit() {
    this.incomeService.findAll().subscribe(data =>{   
      this.incomes =data;
    })
    this.outgoingService.findAll().subscribe(data =>{
      this.outcomes =data;
    })
  }

}
