import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OutgoingService } from '../outgoing.service';
import { Outcome } from '../outcome';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-outgoing-form',
  templateUrl: './outgoing-form.component.html',
  styleUrls: ['./outgoing-form.component.css']
})
export class OutgoingFormComponent {

  public dataFields: Object={text: 'Reason', value:'Id'};
  public groupData: Object[]=[
    {Id: 'Reason1', Reason: 'Taxes'},
    {Id: 'Reason2', Reason: 'Bils'},
    {Id: 'Reason1', Reason: 'Food'},
    {Id: 'Reason1', Reason: 'Enterteiment'},
    {Id: 'Reason1', Reason: 'Travel'},
  ]

  outcome: Outcome;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private outgoingService: OutgoingService) {
    this.outcome = new Outcome();
  }

  onSubmit() {
    this.outgoingService.save(this.outcome).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/list']);
  }
}