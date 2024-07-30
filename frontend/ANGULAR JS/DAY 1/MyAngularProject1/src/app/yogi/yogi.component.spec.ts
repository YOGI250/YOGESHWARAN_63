import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YogiComponent } from './yogi.component';

describe('YogiComponent', () => {
  let component: YogiComponent;
  let fixture: ComponentFixture<YogiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [YogiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(YogiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
