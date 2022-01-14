import {Component, OnInit} from '@angular/core';
import {ExampleService} from "./example.service";
import {finalize, take} from "rxjs/operators";
import {ExampleDto} from "../../model/example/ExampleDto";

@Component({
  selector: 'app-example-component',
  templateUrl: './example.component.html',
  styleUrls: ['./example.component.css']
})
export class ExampleComponent implements OnInit {

  public exampleDto?: ExampleDto;
  public error?: any;
  public isLoading: boolean = true;

  constructor(private exampleService: ExampleService) {
  }

  ngOnInit(): void {
    this.loadExample();
  }

  hasError(): boolean {
    return !!this.error;
  }

  private loadExample(): void {
    this.exampleService.getExample()
      .pipe(
        take(1),
        finalize(() => this.isLoading = false)
      )
      .subscribe(exampleResponse => {
        this.exampleDto = exampleResponse
      }, (error) => {
        this.error = error;
      });
  }

}
