import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FundcardComponent } from './fundcard.component';

describe('FundcardComponent', () => {
  let component: FundcardComponent;
  let fixture: ComponentFixture<FundcardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FundcardComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FundcardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
